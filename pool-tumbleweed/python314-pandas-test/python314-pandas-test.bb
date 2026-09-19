SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-test-3.0.5-2.2.noarch.rpm"
RPM_HASH = "2bfd4e84e41d32841127e2ae627adaea876639f21c683098c63844e15a2e0e297c764b8bc6a30292a0f211089c81792082ee2dc04f7c79b21ea2aa60b5942b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-test"

RDEPENDS:${PN} += "python314-hypothesis \
python314-pandas \
python314-pytest \
python314-pytest-xdist"

inherit rpm
