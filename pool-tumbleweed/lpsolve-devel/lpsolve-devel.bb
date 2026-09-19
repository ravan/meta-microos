SUMMARY = "Files for Developing with lpsolve"
DESCRIPTION = "Includes and definitions for developing with the lpsolve library."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "lpsolve-devel-5.5.2.0-10.39.aarch64.rpm"
RPM_HASH = "f58cf30f41eb7f42ba6e1ccb61968408ce2c4c572d80076fd5a6b781918bebb8e485424cb77bd73a408a9d7faa2ae8da57a46c3096257c9713c3f8a504da0a17"

RPROVIDES:${PN} += "lpsolve-devel"

RDEPENDS:${PN} += "liblpsolve55-0"

inherit rpm
