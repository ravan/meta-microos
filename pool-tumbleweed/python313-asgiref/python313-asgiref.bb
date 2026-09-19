SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python313-asgiref-3.11.1-1.4.noarch.rpm"
RPM_HASH = "8d372c4d268fec48d0faf2c880e8250938234709a4947b758efffaa379cfaeb58c38aad1aa18a776fe0a19e7533241ead43c2adbce8953c23d35a85b9597ff7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asgiref \
python3.13dist-asgiref \
python313-asgiref \
python3dist-asgiref"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
