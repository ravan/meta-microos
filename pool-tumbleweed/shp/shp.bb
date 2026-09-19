SUMMARY = "Like PHP except you write your script in shell script"
DESCRIPTION = "shp parses and executes SHP scripts in the manner of PHP, except nested \
scripts are written in shell scripting language instead of the PHP language. \
shp outputs its script file, with nested <?shp ... ?> blocks executed \
as shell scripts."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "shp-1.0.2-5.24.noarch.rpm"
RPM_HASH = "f9455bb4e2f5b92de75a557e8ecdf033b29e974087effb63a047f6869a26a01e52d92128f16ed8f8bbf177795aab7c81565b8de094fa64567c4a67342dba2550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shp"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
coreutils \
gawk \
openssl"

inherit rpm
