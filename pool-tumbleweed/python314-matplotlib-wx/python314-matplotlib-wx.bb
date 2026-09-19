SUMMARY = "WxWidgets backend for python314-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-wx-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "32357f5e4dec462e81232bb74e2885c9cefff077ff098d72280b41f27cf7298761c30eeb798c23972705231537adf6049c98db81d0b0500de1b35bcddf786797"

RPROVIDES:${PN} += "python314-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-wxPython"

inherit rpm
