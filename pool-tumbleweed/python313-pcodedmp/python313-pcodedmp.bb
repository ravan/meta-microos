SUMMARY = "A VBA p-code disassembler"
DESCRIPTION = "Disassembler for p-code of VBA code in OLE2 documents. \
 \
It supports VBA5 (Office 97, MacOffice 98), VBA6 (Office 2000 to \
Office 2009) and VBA7 (Office 2010 and higher)."
LICENSE = "GPL-3.0-only"

PV = "1.2.6"

RPM_NAME = "python313-pcodedmp-1.2.6-3.5.noarch.rpm"
RPM_HASH = "08a630aba621547a9e673ca4d700003e79cd2d288861833e08c0673ccefc5708902482cd47c3ab8e6dd7174b014ab9f573278af163252d896836166b30efecaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pcodedmp \
python3.13dist-pcodedmp \
python313-pcodedmp \
python3dist-pcodedmp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-oletools"

inherit rpm
