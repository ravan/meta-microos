SUMMARY = "Javadocs for jnr-ffi"
DESCRIPTION = "This package contains the API documentation for jnr-ffi."
LICENSE = "Apache-2.0"

PV = "2.2.13"

RPM_NAME = "jnr-ffi-javadoc-2.2.13-2.10.noarch.rpm"
RPM_HASH = "02b39ef5c249bb1bc9a46af10a423827b29e52d93d5a42fa408eb91da42b8105131e03c122fab6bac1e048a44ad57351610dc6e7986fa162d1d0e4054049c839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-ffi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
