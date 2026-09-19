SUMMARY = "Define and run multi-container applications with Docker"
DESCRIPTION = "Docker Compose is a tool for running multi-container applications on Docker \
defined using the Compose file format. A Compose file is used to define how the \
one or more containers that make up your application are configured. Once you \
have a Compose file, you can create and start your application with a single \
command: docker compose up. \
 \
About update and backward compatibility \
 \
Docker Compose V2 is a major version bump release of Docker Compose. It has \
been completely rewritten from scratch in Golang (V1 was in Python). The \
installation instructions for Compose V2 differ from V1. V2 is not a standalone \
binary anymore, and installation scripts will have to be adjusted. Some \
commands are different. \
 \
For a smooth transition from legacy docker-compose 1.xx, please consider \
installing compose-switch to translate docker-compose ... commands into Compose \
V2's docker compose .... . Also check V2's --compatibility flag."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "docker-compose-5.5.0-1.1.aarch64.rpm"
RPM_HASH = "e5a593d8f85df0bc89151d00cc0ff3ea3971e0f0301539f270c2c61fc7fe5ee018c3fceb769cea81f9ed861f91e35ab9ab65bd8b5837ff53d7f4069b4266f886"

RPROVIDES:${PN} += "docker-compose"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
