SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python314-MarkupSafe-3.0.3-1.6.aarch64.rpm"
RPM_HASH = "9cd7af91559e7ff670ff2ccb21a5164b16cb22c5edd07f4a7d8b08aea9d345ed4736a7a8790dfeb2b4a3e9fb0d06548cc2238d684b0c2bc980a66349d54ab315"

RPROVIDES:${PN} += "python3.14dist-markupsafe \
python314-MarkupSafe \
python3dist-markupsafe"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python314-base"

inherit rpm
