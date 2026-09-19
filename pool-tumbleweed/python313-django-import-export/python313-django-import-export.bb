SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "4.4.1"

RPM_NAME = "python313-django-import-export-4.4.1-1.2.noarch.rpm"
RPM_HASH = "eb4df1627cb980ef9a17387df069972ce8c1de26d2d1e9a9d5df2baffd66e2b8bd5f1d280bcd1e61372c3b1ef341c466536130c75b11d237718825583e575405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-import-export \
python3.13dist-django-import-export \
python313-django-import-export \
python3dist-django-import-export"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-diff-match-patch \
python313-tablib"

inherit rpm
