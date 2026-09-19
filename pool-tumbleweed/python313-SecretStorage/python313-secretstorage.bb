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

RPM_NAME = "python313-SecretStorage-3.5.0-1.3.noarch.rpm"
RPM_HASH = "c9609642771b37aefe0448115a4643950367babac36ef29c584728783ab979469aaa32f1178fc01515d8a3f7c7880616058474edc68153766681af0c0a0c989d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SecretStorage \
python3.13dist-secretstorage \
python313-SecretStorage \
python3dist-secretstorage"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-jeepney"

inherit rpm
