SUMMARY = "File IDs for documents in a running Jupyter Server -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "jupyter-server-fileid-0.9.3-1.8.noarch.rpm"
RPM_HASH = "67fe68b892f8539f80a7e436f5585b1bd73ec5f9d9a20e55249cede5aa48bac8ec97ea51279d161b2aa6b97b1ba501fe791ba50c29bbc23e977e79bd24b2d68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-fileid"

RDEPENDS:${PN} += "python3dist-jupyter-server-fileid"

inherit rpm
