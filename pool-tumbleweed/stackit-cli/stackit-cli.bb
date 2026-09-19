SUMMARY = "A command-line interface to manage STACKIT resources"
DESCRIPTION = "Welcome to the STACKIT CLI, a command-line interface for STACKIT - The German \
business cloud. \
 \
The STACKIT CLI allows you to manage your STACKIT services and resources as \
well as perform operations using the command-line or in scripts or automation, \
such as: \
 \
* Projects, including permissions \
* STACKIT Kubernetes Engine clusters \
* Servers \
* DNS zones and record-sets \
* Databases such as PostgreSQL Flex, MongoDB Flex and SQLServer Flex \
 \
This CLI is in a BETA state. More services and functionality will be supported \
soon. Your feedback is appreciated!"
LICENSE = "Apache-2.0"

PV = "0.71.0"

RPM_NAME = "stackit-cli-0.71.0-1.1.aarch64.rpm"
RPM_HASH = "7b759f13fd6be01165878c03a2537a69adce3b3bfd6724ab30ca60b5432477d2d9da47d73e2c3168a6b74fcccd318758f527182c65c8301e1a66960b1499b2b1"

RPROVIDES:${PN} += "stackit \
stackit-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
