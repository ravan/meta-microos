SUMMARY = "Pytest plugin to run Xvfb for tests"
DESCRIPTION = "A pytest plugin to run Xvfb for tests. \
 \
With Xvfb and the plugin installed, your testsuite automatically runs \
with Xvfb. This allows tests to be run without windows popping up \
during GUI tests or on systems without a display (like a CI). \
 \
If Xvfb is not installed, the plugin does not run and your tests will \
still work as normal. However, a warning message will print to standard \
output letting you know that Xvfb is not installed. \
 \
If you're currently using xvfb-run in something like .travis.yml, \
simply remove it and install this plugin instead - then you'll also have the \
benefits of Xvfb locally."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python313-pytest-xvfb-3.1.1-1.4.noarch.rpm"
RPM_HASH = "c3f7ea5505ebb63fc69493f65f479ee5ceb8135a2453ba4f535f6ba29d245e65124111d3865c1f246aa67c9cb5deedb92fb1bc4e44484cdfc6f2baacb2217ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xvfb \
python3.13dist-pytest-xvfb \
python313-pytest-xvfb \
python3dist-pytest-xvfb"

RDEPENDS:${PN} += "python-abi \
python313-PyVirtualDisplay \
python313-pytest \
xdpyinfo"

inherit rpm
