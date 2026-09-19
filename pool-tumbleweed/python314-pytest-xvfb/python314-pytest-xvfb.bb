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

RPM_NAME = "python314-pytest-xvfb-3.1.1-1.4.noarch.rpm"
RPM_HASH = "e065758412e4e7e4f4585b9aebd7801b3b10f6e72048da722f310441faca610b18dc5db2a38cc95892db0c8e83daec2b8fa06c505aa080975a528b7520fa9a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-xvfb \
python314-pytest-xvfb \
python3dist-pytest-xvfb"

RDEPENDS:${PN} += "python-abi \
python314-PyVirtualDisplay \
python314-pytest \
xdpyinfo"

inherit rpm
