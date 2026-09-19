SUMMARY = "A client that automates access to the JFrog products"
DESCRIPTION = "JFrog CLI is a compact and smart client that provides a simple interface that \
automates access to Artifactory and Mission Control through their respective \
REST APIs. By using the JFrog CLI, you can greatly simplify your automation \
scripts making them more readable and easier to maintain. Several features of \
the JFrog CLI makes your scripts more efficient and reliable: \
 \
- Multithreaded upload and download of artifacts make builds run faster \
- Checksum optimization reduces redundant file transfers \
- Wildcards and regular expressions give you an easy way to collect all the \
  artifacts you wish to upload or download. \
- 'Dry run' gives you a preview of file transfer operations before you actually \
run them"
LICENSE = "Apache-2.0"

PV = "2.122.0"

RPM_NAME = "jfrog-cli-2.122.0-1.1.aarch64.rpm"
RPM_HASH = "06c4bce0341f6c309563eb954c816b993fd4ec312c0474ff654494680ecae4d915f3db50cd1714f6d62356bf264376f097b6b648b361eb269c615a9059c22235"

RPROVIDES:${PN} += "jf \
jfrog-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
