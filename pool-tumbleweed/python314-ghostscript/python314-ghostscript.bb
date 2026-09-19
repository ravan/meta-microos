SUMMARY = "Python interface to the Ghostscript C-API"
DESCRIPTION = "Python interface to the Ghostscript C-API, both high and low-level, based on ctypes."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python314-ghostscript-0.8.1-1.4.noarch.rpm"
RPM_HASH = "c8b56581ee47bdd59c5afc6b9c4fda25af62cd8a36c9c147c4144ce644f32d8ac40ad95053af4664dca41c03a80605f0ef452aa08bb8f46911df1f17809d90a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ghostscript \
python314-ghostscript \
python3dist-ghostscript"

RDEPENDS:${PN} += "ghostscript \
python-abi \
python314-setuptools"

inherit rpm
