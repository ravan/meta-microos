SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.11"

RPM_NAME = "python314-Genshi-0.7.11-2.2.aarch64.rpm"
RPM_HASH = "109ddfe9b3daeed7426583ca82daefd7886cc684468904435f1acab10571e48ba7bfbe874e9a7f0ea3aeff41c803298f250a8dd9c0a2997f414f3704cd99d8a2"

RPROVIDES:${PN} += "python3.14dist-genshi \
python314-Genshi \
python3dist-genshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-Babel \
python314-xml"

inherit rpm
