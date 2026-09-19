SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python313-pytest-mockito-0.0.5-1.5.noarch.rpm"
RPM_HASH = "88856493aa480aac1b4f5ca9c102ea197f243308e5bc105248faf231076ca3cb4020b1e3a4a1c090e0b3d933fa5aaca7e1bd93f860cae34411306c03a1fb4b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mockito \
python3.13dist-pytest-mockito \
python313-pytest-mockito \
python3dist-pytest-mockito"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python313 \
python313-mockito \
python313-pytest"

inherit rpm
