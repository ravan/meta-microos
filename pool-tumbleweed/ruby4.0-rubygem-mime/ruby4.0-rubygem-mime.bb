SUMMARY = "Multipurpose Internet Mail Extensions (MIME) Library"
DESCRIPTION = "A library for building RFC compliant Multipurpose Internet Mail Extensions \
(MIME) messages. It can be used to construct standardized MIME messages for \
use \
in client/server communications, such as Internet mail or HTTP \
multipart/form-data transactions."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "ruby4.0-rubygem-mime-0.4.4-1.29.aarch64.rpm"
RPM_HASH = "4599b574497d2af5a1fd97143db3ba8b9565a560e244c32a9425ded0f7d13b8b639be68355ee25db342d026601a1ddaca485a8042f1e52187241c3ab0b9b0ef3"

RPROVIDES:${PN} += "ruby4.0-rubygem-mime \
rubygem-mime \
rubygem-ruby-4.0.0-mime \
rubygem-ruby-4.0.0-mime-0 \
rubygem-ruby-4.0.0-mime-0.4 \
rubygem-ruby-4.0.0-mime-0.4.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
