SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python313-yamldoc-0.3.0-2.5.noarch.rpm"
RPM_HASH = "ee76d94190f02df5cf0683f9d29670f7667cbb7af53e842a9f8ea7fcee590c26e5f5d146582694bcb029a27ac92c216f1d85388adf68f6d194654e24e6042aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamldoc \
python3.13dist-python-yamldoc \
python313-yamldoc \
python3dist-python-yamldoc"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
