SUMMARY = "Airgap Swiss Army Knife"
DESCRIPTION = "Rancher Government Hauler simplifies the airgap experience without requiring \
users to adopt a specific workflow. Hauler simplifies the airgapping process, \
by representing assets (images, charts, files, etc...) as content and \
collections to allow users to easily fetch, store, package, and distribute \
these assets with declarative manifests or through the command line. \
 \
Hauler does this by storing contents and collections as OCI Artifacts and \
allows users to serve contents and collections with an embedded registry and \
fileserver. Additionally, Hauler has the ability to store and inspect various \
non-image OCI Artifacts."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "hauler-2.1.0-4.1.aarch64.rpm"
RPM_HASH = "d1204355c0d96d1d255397c87a6b2f0256cddda1fcc52250dda2bf4805bd48bd2b973bb187143d287a5dfd0feb07e5e78687850abe017684e843c47bd114390b"

RPROVIDES:${PN} += "hauler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
