SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python313-flickrapi-2.4.0-4.9.noarch.rpm"
RPM_HASH = "a9ec284c4896b99111659406102163cab70a7cf47489f60a1cd7f0550a7656f5e24ccebc4e766703d0619ee987bbbb0009659417268c10f0da8e3772ecbb17b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flickrapi \
python3.13dist-flickrapi \
python313-flickrapi \
python3dist-flickrapi"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-requests-oauthlib \
python313-requests-toolbelt"

inherit rpm
