SUMMARY = "Ancient Greek (Ἑλληνική) Dictionary for Aspell"
DESCRIPTION = "An Ancient Greek (Ἑλληνική) dictionary for the aspell spell checker."
LICENSE = "GPL-3.0-only"

PV = "0.02.0"

RPM_NAME = "aspell-grc-0.02.0-4.7.aarch64.rpm"
RPM_HASH = "3e31c6bb1aa5bf17114d5d71ec436a733c363794e5216f7f4d3c5669fd3f653f7c692faf21ef87b0f489f04f0e9bc4052549df22fe84399724ce4842025bb34a"

RPROVIDES:${PN} += "aspell-grc \
locale-aspell-grc"

RDEPENDS:${PN} += ""

inherit rpm
