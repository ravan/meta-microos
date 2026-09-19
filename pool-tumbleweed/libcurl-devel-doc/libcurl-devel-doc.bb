SUMMARY = "Manual pages for libcurl"
DESCRIPTION = "Manual pages for the libcurl C API."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "libcurl-devel-doc-8.22.0-1.1.noarch.rpm"
RPM_HASH = "4c181b2e823e70b9bb3f3e904e6df332457b980bcd10421e6ef1e583c429c5b92c570df393472228d32c5ffd2b960713d60ba91dac9f983a7de023ba6140fcec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcurl-devel-/usr/share/man/man1/curl-config.1.gz \
libcurl-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
