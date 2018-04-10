package com.example.demo.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy.RepositoryDetectionStrategies;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

	  config.setRepositoryDetectionStrategy( RepositoryDetectionStrategies.DEFAULT );
	  config.getMetadataConfiguration().setAlpsEnabled(false);
  }
}
