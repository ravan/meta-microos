SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python314-yamldoc-0.3.0-2.5.noarch.rpm"
RPM_HASH = "7d9b2c6811e21dd9b4cfdcbeb6a50ae963d4a6d9232b03f84095be9a882484eb7bce08274f499276013983f61906438a22c241cb57fda26bd56d53c27adc50e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-yamldoc \
python314-yamldoc \
python3dist-python-yamldoc"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
