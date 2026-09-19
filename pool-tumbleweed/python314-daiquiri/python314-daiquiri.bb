SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "python314-daiquiri-3.4.0-1.2.noarch.rpm"
RPM_HASH = "189690f6f76eea8e879b314714111dd31a6368866809fa7e8505f8e92764a98855e3b65144ef058e83d1199dceb54bf05877f1d8beab3564ae7e374372b5595c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-daiquiri \
python314-daiquiri \
python3dist-daiquiri"

RDEPENDS:${PN} += "python-abi \
python314-python-json-logger"

inherit rpm
