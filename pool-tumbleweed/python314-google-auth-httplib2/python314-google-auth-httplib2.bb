SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python314-google-auth-httplib2-0.4.1-1.1.noarch.rpm"
RPM_HASH = "1fa5120b0ed3220a18f6babc5d23f34a40be38d8edbba73f08d3bbcfc9beb2b2f0e784990a6343761d42e03aa3ed8fa609630e5e00b1d77a76aa12e4748476dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-auth-httplib2 \
python314-google-auth-httplib2 \
python3dist-google-auth-httplib2"

RDEPENDS:${PN} += "python-abi \
python314-google-auth \
python314-httplib2"

inherit rpm
