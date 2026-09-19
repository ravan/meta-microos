SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.1.5"

RPM_NAME = "python314-openpyxl-3.1.5-1.9.noarch.rpm"
RPM_HASH = "fd1ebf894897ef421c65ab14d22752960355d97a5d9c8ae644ecaae745f3147846e269203bf02c276ea0a04982595e1982745f584f4001d54b52bcc013e443cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openpyxl \
python314-openpyxl \
python3dist-openpyxl"

RDEPENDS:${PN} += "python-abi \
python314-et-xmlfile"

inherit rpm
