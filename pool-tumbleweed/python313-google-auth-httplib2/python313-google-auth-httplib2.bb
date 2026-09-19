SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python313-google-auth-httplib2-0.4.1-1.1.noarch.rpm"
RPM_HASH = "d81ac215d261c6b411d251e63e37e194943ff9883a3283ef448201373700400ceb8259d102a69f0f024cf318c57c7d113adc2019b7348f3437828e9ae9d22062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth-httplib2 \
python3.13dist-google-auth-httplib2 \
python313-google-auth-httplib2 \
python3dist-google-auth-httplib2"

RDEPENDS:${PN} += "python-abi \
python313-google-auth \
python313-httplib2"

inherit rpm
