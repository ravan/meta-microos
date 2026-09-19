SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.2"

RPM_NAME = "python313-rarfile-doc-4.2-3.5.noarch.rpm"
RPM_HASH = "f75470013787018fd5dcfce2290d949c3657a8538445f69b6541b5dcda81a6910c097c4b52c3a9397977f80f674a5044c29e7786b48403583e3b28b50365868f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rarfile-doc \
python313-rarfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
