SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python314-sox-1.5.0-2.5.noarch.rpm"
RPM_HASH = "e3d752cbc3960a909cc708c8d180d37695132c7670d40470e9579d92f9067305716dbf7f1a35ad4ffa14e6ff18fb1d40146194704669da54eb8d46db598ea31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sox \
python314-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-typing-extensions \
sox"

inherit rpm
