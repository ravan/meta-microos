SUMMARY = "Python bindings to FreeDesktoporg Secret Service API"
DESCRIPTION = "This module provides a way for securely storing passwords and other secrets. \
 \
It uses D-Bus `Secret Service`_ API that is supported by GNOME Keyring \
(since version 2.30) and KSecretsService. \
 \
The main classes provided are ``secretstorage.Item``, representing a secret \
item (that has a *label*, a *secret* and some *attributes*) and \
``secretstorage.Collection``, a place items are stored in. \
 \
SecretStorage supports most of the functions provided by Secret Service, \
including creating and deleting items and collections, editing items, \
locking and unlocking collections (asynchronous unlocking is also supported). \
 \
The documentation can be found on `pythonhosted.org`_. \
 \
.. _`Secret Service`: https://specifications.freedesktop.org/secret-service/ \
.. _`pythonhosted.org`: https://pythonhosted.org/SecretStorage/"
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "python314-SecretStorage-3.5.0-1.3.noarch.rpm"
RPM_HASH = "bffb214f2d84f76e471955e083186444deee915ec495fcab07851ab5f4252099154e1d527d70d14c4e64f7697d41e5ef9612e8dacaa7092b060ec65e02fb162b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-secretstorage \
python314-SecretStorage \
python3dist-secretstorage"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-jeepney"

inherit rpm
