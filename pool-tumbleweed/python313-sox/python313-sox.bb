SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-sox-1.5.0-2.5.noarch.rpm"
RPM_HASH = "da421a5f276692122b3458ee85b4452704319eaf9d1eff6cc0fe2f8d64994028f5672db0d7062e823b95664439ba92c09fa829a3427010b8a494fbe4fe47bf4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sox \
python3.13dist-sox \
python313-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-typing-extensions \
sox"

inherit rpm
