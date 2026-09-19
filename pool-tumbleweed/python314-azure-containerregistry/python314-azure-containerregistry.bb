SUMMARY = "Microsoft Azure Container Registry Client Library for Python"
DESCRIPTION = "Azure Container Registry allows you to store and manage container images and \
artifacts in a private registry for all types of container deployments. \
 \
Use the client library for Azure Container Registry to: \
 \
 * List images or artifacts in a registry \
 * Obtain metadata for images and artifacts, repositories and tags \
 * Set read/write/delete properties on registry items \
 * Delete images and artifacts, repositories and tags"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-azure-containerregistry-1.2.0-2.9.noarch.rpm"
RPM_HASH = "373a2b4c9c0527f55deea5c43938484e9168ec30ab626725d9771fe3e8afffbd716b0e59d4c60ff91c05b10647a09acb5738d6178589f2e75888e868df470ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-containerregistry \
python314-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-isodate"

inherit rpm
