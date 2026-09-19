SUMMARY = "Zope testing helpers"
DESCRIPTION = "This package provides a number of testing frameworks. \
 \
cleanup \
  Provides a mixin class for cleaning up after tests that \
  make global changes. \
 \
formparser \
  An HTML parser that extracts form information. \
 \
  **Python 2 only** \
 \
  This is intended to support functional tests that need to extract \
  information from HTML forms returned by the publisher. \
 \
  See formparser.txt. \
 \
loggingsupport \
  Support for testing logging code \
 \
  If you want to test that your code generates proper log output, you \
  can create and install a handler that collects output. \
 \
loghandler \
  Logging handler for tests that check logging output. \
 \
module \
  Lets a doctest pretend to be a Python module. \
 \
  See module.txt. \
 \
renormalizing \
  Regular expression pattern normalizing output checker. \
  Useful for doctests. \
 \
server \
  Provides a simple HTTP server compatible with the zope.app.testing \
  functional testing API.  Lets you interactively play with the system \
  under test.  Helpful in debugging functional doctest failures. \
 \
  **Python 2 only** \
 \
setupstack \
  A simple framework for automating doctest set-up and tear-down. \
  See setupstack.txt. \
 \
wait \
  A small utility for dealing with timing non-determinism \
  See wait.txt."
LICENSE = "ZPL-2.1"

PV = "6.2"

RPM_NAME = "python314-zope.testing-6.2-1.1.noarch.rpm"
RPM_HASH = "3fc5316cc84bdc89891df74e53c3dfd4edc5452100f505dce577902d7181c4b95e5f9018d56630a3865a95d2c5a32a3ab423d36e761d8981b81a58b4878f140c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.testing \
python314-zope.testing \
python3dist-zope.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
