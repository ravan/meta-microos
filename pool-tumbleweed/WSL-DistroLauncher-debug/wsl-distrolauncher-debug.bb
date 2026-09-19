SUMMARY = "Debug information for package WSL-DistroLauncher"
DESCRIPTION = "This package provides debug information for package WSL-DistroLauncher. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "MIT"

PV = "0.0.1+git20230111.22db092"

RPM_NAME = "WSL-DistroLauncher-debug-0.0.1+git20230111.22db092-1.7.noarch.rpm"
RPM_HASH = "c9352d8bd8775aa3d5457b5b0e380da91168fc357fd0eba5c6aea4604335a7b6670a4341a13c3166f5fe5011548ee1c26abd083ad1b70f731b06336a8065f625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher-debug"

RDEPENDS:${PN} += ""

inherit rpm
