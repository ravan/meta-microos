SUMMARY = "Python3 bindings for notmuch"
DESCRIPTION = "Python3 interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "python3-notmuch-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "1406441f7974cef60aec5a80f9260d3a0d9ccecc6b4988274fd3a8d0adcd0a51f6dbec57df322ab5df3e1ccd60ee203a0fdfa8243556cdf7ca3ba9bb05a9d553"

RPROVIDES:${PN} += "python3-notmuch \
python3.13dist-notmuch \
python3dist-notmuch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
