SUMMARY = "Print x509 certificate info"
DESCRIPTION = "Similar to openssl x509 -in <file> -text command, but handles chains, multiple files and TCP addresses. TLS/SSL version prints as well when using TCP address argument."
LICENSE = "MIT"

PV = "1.0.40+git20260221.5574ad1"

RPM_NAME = "certinfo-1.0.40+git20260221.5574ad1-1.6.aarch64.rpm"
RPM_HASH = "6a178ed679d74b241d16cfa993ea763e3f8504b09fc39fcef4127529b6d8687300c5599de52169a041afbdf17d8ab6ffac722f42328719657afca6aef5bdd596"

RPROVIDES:${PN} += "certinfo"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
