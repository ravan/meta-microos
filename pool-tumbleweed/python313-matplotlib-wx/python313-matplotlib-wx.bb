SUMMARY = "WxWidgets backend for python313-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-wx-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "2739469cf8b76a07248cbe95b66e80f732493a8af39878f21c2842faa6775c91b99a65ecdf41a4a8148d2a12cd95aaa148e0bdead222232136dde9a86fae4403"

RPROVIDES:${PN} += "python3-matplotlib-wx \
python313-matplotlib-wx"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-wxPython"

inherit rpm
