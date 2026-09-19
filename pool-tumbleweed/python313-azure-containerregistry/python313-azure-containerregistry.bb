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

RPM_NAME = "python313-azure-containerregistry-1.2.0-2.9.noarch.rpm"
RPM_HASH = "e80fba543ff516e7a91334b2f3f93247183ab1cd2cd7aaa9c8962ea539a3728ef3bee71fbc966e53c5d68a99544465855364ab8a73293c23d36f83cd8e62a4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-containerregistry \
python3.13dist-azure-containerregistry \
python313-azure-containerregistry \
python3dist-azure-containerregistry"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-isodate"

inherit rpm
