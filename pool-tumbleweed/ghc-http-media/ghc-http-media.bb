SUMMARY = "Processing HTTP Content-Type and Accept headers"
DESCRIPTION = "This library is intended to be a comprehensive solution to parsing and \
selecting quality-indexed values in HTTP headers. It is capable of parsing both \
media types and language parameters from the Accept and Content header \
families, and can be extended to match against other accept headers as well. \
Selecting the appropriate header value is achieved by comparing a list of \
server options against the quality-indexed values supplied by the client. \
 \
In the following example, the Accept header is parsed and then matched against \
a list of server options to serve the appropriate media using 'mapAcceptMedia': \
 \
> getHeader >>= maybe send406Error sendResourceWith . mapAcceptMedia > [ \
('text/html', asHtml) > , ('application/json', asJson) > ] \
 \
Similarly, the Content-Type header can be used to produce a parser for request \
bodies based on the given content type with 'mapContentMedia': \
 \
> getContentType >>= maybe send415Error readRequestBodyWith . \
mapContentMedia > [ ('application/json', parseJson) > , ('text/plain', \
parseText) > ] \
 \
The API is agnostic to your choice of server."
LICENSE = "MIT"

PV = "0.8.1.1"

RPM_NAME = "ghc-http-media-0.8.1.1-3.21.aarch64.rpm"
RPM_HASH = "0405a6a3d537677bb2873afabec622ed0e95cbde13a58fa02bc09bace583dfce9eaf8dbb43e622d31330de89e2179c74980f7f3c92ffbbff83203cf2cc6653f0"

RPROVIDES:${PN} += "ghc-http-media \
libHShttp-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
