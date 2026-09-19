SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python313-MarkupSafe-3.0.3-1.6.aarch64.rpm"
RPM_HASH = "0c6e08ca35bacef3e65ee0f03398f4a84b6c7cf40d8b75fc6b67749b346d4615a6e4bbef094ffa7229365e6d6983e552f720772f7c518492c5fd5148c3e4c6f6"

RPROVIDES:${PN} += "python3-MarkupSafe \
python3.13dist-markupsafe \
python313-MarkupSafe \
python3dist-markupsafe"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python313-base"

inherit rpm
