SUMMARY = "Replacement for the docker-compose (python) executable"
DESCRIPTION = "Compose Switch is a replacement to the Compose V1 docker-compose (python) executable. It translates the command line into Compose V2 docker compose then run the latter."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "docker-compose-switch-1.0.5-2.8.aarch64.rpm"
RPM_HASH = "32242a0cffb49415b7f51cb68a595531d597f6c51082c3a66dedec1e708fdf9cf3147205361d5e5b4e3868ae65e8bfc9d5aac88020d66d7ece9b9931aab2df3c"

RPROVIDES:${PN} += "docker-compose-switch"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
docker-compose \
libc.so.6 \
update-alternatives"

inherit rpm
