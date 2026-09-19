SUMMARY = "Bazel workspaces for libraries packaged in openSUSE"
DESCRIPTION = "Bazel workspaces for libraries packaged in openSUSE which allow to link those \
libraries dynamically to software build by Bazel."
LICENSE = "Apache-2.0"

PV = "20200113"

RPM_NAME = "bazel-workspaces-20200113-1.18.noarch.rpm"
RPM_HASH = "4c8f74ce4b3ea8ea2e8237ab8b812b7fd49cacd52178ee16b4e098f84790380769be11e1c8d9bca82d6c9f7be83b4a99a6cf04938fd3a96e0cef22ae93b70f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-workspaces"

RDEPENDS:${PN} += ""

inherit rpm
