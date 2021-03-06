#!/bin/bash

# grid_env.sh defines grid-wide parameters to configure a
# single grid. Parameters defined in this file become the
# default parameters for all sites. Any of the parameters
# can be overwritten in individual site files. A site file
# must begin with a site name followed by the "_env.sh" postfix.

# SITES: List the site names separated by space. These sites belong
# to a single Pado grid. The first site in the list is always
# always the default site.
SITES="%%SITES%%"

# Enable or disable security. If security is disabled
# then the $ETC_GRID/gfsecurity.properties file is ignored.
# Note that if this parameter is set to true and the security
# file does not exist then the server will not start.
#SECURITY_ENABLED=true

# GRID_ID: Grid ID is a unique ID representing this grid. 
# If GRID_ID is not defined then the grid ID in the
# $GRIDS list defined in all_env.sh is assigned. It must 
# not include spaces.
GRID_ID=$GRID

# GRID_NAME: Grid name is a legible non-unique name display
# purposes. Any characters including spaces are allowed.
GRID_NAME=$GRID

# ETC_GRID_DIR: etc directory that contains the config files 
# (*.properties, *.xml). 
# Default: ETC_GRID_DIR=$BASE_DIR/etc/$GRID
#ETC_GRID_DIR=$BASE_DIR/etc/$GRID

# RUN_DIR: Run directory - Pado server working directory
# Default: RUN_DIR=$BASE_DIR/run
#RUN_DIR=$BASE_DIR/run

# LOG_DIR: Log directory
# Default: LOG_DIR=$BASE_DIR/log
#LOG_DIR=$BASE_DIR/log

# STATS_DIR: Stats directory
# Default: STATS_DIR=$BASE_DIR/stats
#STATS_DIR=$BASE_DIR/stats

# PADO_PLUGINS_DIR: Plugins directory. All of Pado plug-in jar
# files must be deployed into this directory. Pado also 
# hot-deploys IBiz and versioned data class jar files to this
# this directory.
# Default: PADO_PLUGINS_DIR=$BASE_DIR/plugins
#PADO_PLUGINS_DIR=$BASE_DIR/plugins

# Pado app directory that contains client app config files
#PADO_APP_CONFIG_DIR=$ETC_GRID_DIR/app

# Pado properties file path
#PADO_PROPERTY_FILE=$ETC_GRID_DIR/pado.properties

# Pado XML file path
# Default: $ETC_GRID_DIR/pado.xml
#PADO_XML_FILE=$ETC_GRID_DIR/pado_${SITE}.xml

# Server properties file path
#SERVER_PROPERTY_FILE=$ETC_GRID_DIR/server.properties

# Server security properties file path.
#SERVER_SECURITY_PROPERTY_FILE=$ETC_GRID_DIR/gfsecurity.properties

# Server configuration XML file path.
#SERVER_XML_FILE=$ETC_GRID_DIR/server.xml
