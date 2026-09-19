SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python314-itemadapter-0.13.1-2.1.noarch.rpm"
RPM_HASH = "0fd1513268ec04a43e93cf7849922667cccffb3b552e06ee7ee4f3816d769be815411b47325bd7ed30618e28e29d37b4baeab7c880bc260b74391f52c9777837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-itemadapter \
python314-itemadapter \
python3dist-itemadapter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
