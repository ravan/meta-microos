SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python314-pcodedmp-1.2.6-3.5.noarch.rpm"
RPM_HASH = "a015efecd23a995a77a934010c15a460ffbe6710e823d3e3f671d3be9ca59fb758d103afda6b72ff0ee43eedca8960cba158b337581320de12140c14f80bffac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pcodedmp \
python314-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-oletools"

inherit rpm
