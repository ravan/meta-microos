SUMMARY = "Facilities for environment variables"
DESCRIPTION = "Facilities for environment variables"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-jaraco.env-1.0.0-1.4.noarch.rpm"
RPM_HASH = "8059e94cdad39bd5248a19ab5e4969b560bc2db3bf085cdfb57e5e246f96a837f35f45892804f80c17275f4d2d336c6c7b80062f62fcb1af694609ab10d8c0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.env \
python314-jaraco.env \
python3dist-jaraco.env"

RDEPENDS:${PN} += "python-abi"

inherit rpm
