SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python314-asgiref-3.11.1-1.4.noarch.rpm"
RPM_HASH = "dc60762b3e503c8e524236c457e529c3781068564c6835c07982280bbe26713bcd9173feba17a91ececeb38cdeff9773d9b1c87c962bf4179940a51bfdb8d410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asgiref \
python314-asgiref \
python3dist-asgiref"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
