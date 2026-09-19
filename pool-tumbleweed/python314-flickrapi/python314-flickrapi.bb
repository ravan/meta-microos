SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python314-flickrapi-2.4.0-4.9.noarch.rpm"
RPM_HASH = "55e8631763826831000ac088f36635177e566dc3c8433b95debf648526c04018b9b3fd843f16edbef7561131b8fc8f8747586dffd5e77818be36bd8130f783a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flickrapi \
python314-flickrapi \
python3dist-flickrapi"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-requests-oauthlib \
python314-requests-toolbelt"

inherit rpm
