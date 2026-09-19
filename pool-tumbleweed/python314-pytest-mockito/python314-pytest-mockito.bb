SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python314-pytest-mockito-0.0.5-1.5.noarch.rpm"
RPM_HASH = "d8835dc5670e36671e148c3b1504b2ff970de23b51911f429358358fff02b20e68ca5035857031c23b4d06f3055ef98ea2b3ff90886a27efeee06b33e75b5275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mockito \
python314-pytest-mockito \
python3dist-pytest-mockito"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python314 \
python314-mockito \
python314-pytest"

inherit rpm
