SUMMARY = "Install everything built from the mono source tree"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Install everything built from the mono source tree.  Note that this does \
not install anything from outside the mono source (XSP, mono-basic, etc.)."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-complete-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "0dd916d128a5122739395b50a53c756a3c001044fde65bd5e3293ed4c0162bedb2c92059dec9d63e7be89f9248ffa5de6ae60d1e7629e3ba734fc10394ea6a9e"

RPROVIDES:${PN} += "mono-complete"

RDEPENDS:${PN} += "ibm-data-db2 \
libmono-2-0-1 \
libmono-2-0-devel \
libmonosgen-2-0-1 \
libmonosgen-2-0-devel \
mono-core \
mono-data \
mono-data-oracle \
mono-data-sqlite \
mono-devel \
mono-extras \
mono-locale-extras \
mono-mvc \
mono-reactive \
mono-wcf \
mono-web \
mono-winforms \
mono-winfxcore \
monodoc-core"

inherit rpm
