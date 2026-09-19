SUMMARY = "Manage, store, and distribute sensitive data"
DESCRIPTION = "OpenBao exists to provide a software solution to manage, store, and distribute \
sensitive data including secrets, certificates, and keys. The OpenBao community \
intends to provide this software under an OSI-approved open-source license, led \
by a community run under open governance principles. \
 \
A modern system requires access to a multitude of secrets: database \
credentials, API keys for external services, credentials for service-oriented \
architecture communication, etc. Understanding who is accessing what secrets is \
already very difficult and platform-specific. Adding on key rolling, secure \
storage, and detailed audit logs is almost impossible without a custom \
solution. This is where OpenBao steps in. \
 \
The key features of OpenBao are: \
 \
* Secure Secret Storage: Arbitrary key/value secrets can be stored in OpenBao. \
  OpenBao encrypts these secrets prior to writing them to persistent storage, \
  so gaining access to the raw storage isn't enough to access your secrets. \
  OpenBao can write to disk, Consul, and more. \
* Dynamic Secrets: OpenBao can generate secrets on-demand for some systems, \
  such as AWS or SQL databases. For example, when an application needs to \
  access an S3 bucket, it asks OpenBao for credentials, and OpenBao will \
  generate an AWS keypair with valid permissions on demand. After creating \
  these dynamic secrets, OpenBao will also automatically revoke them after the \
  lease is up. \
* Data Encryption: OpenBao can encrypt and decrypt data without storing it. \
  This allows security teams to define encryption parameters and developers to \
  store encrypted data in a location such as a SQL database without having to \
  design their own encryption methods. \
* Leasing and Renewal: All secrets in OpenBao have a lease associated with \
  them. At the end of the lease, OpenBao will automatically revoke that secret. \
  Clients are able to renew leases via built-in renew APIs. \
* Revocation: OpenBao has built-in support for secret revocation. OpenBao can \
  revoke not only single secrets, but a tree of secrets, for example, all \
  secrets read by a specific user, or all secrets of a particular type. \
  Revocation assists in key rolling as well as locking down systems in the case \
  of an intrusion."
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "b7be1137d990832b11110f52200d8e778deb3d2980167a2390bef7550f6e47b82790f7697da781fa8faf4c8e03ce94ee5a485775fb3a28207eb1bdaa27d365e9"

RPROVIDES:${PN} += "bao \
openbao"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
