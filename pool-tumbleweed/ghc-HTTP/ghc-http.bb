SUMMARY = "A library for client-side HTTP"
DESCRIPTION = "The HTTP package supports client-side web programming in Haskell. It lets you \
set up HTTP connections, transmitting requests and processing the responses \
coming back, all from within the comforts of Haskell. It's dependent on the \
network package to operate, but other than that, the implementation is all \
written in Haskell. \
 \
A basic API for issuing single HTTP requests + receiving responses is provided. \
On top of that, a session-level abstraction is also on offer (the \
'BrowserAction' monad); it taking care of handling the management of persistent \
connections, proxies, state (cookies) and authentication credentials required \
to handle multi-step interactions with a web server. \
 \
The representation of the bytes flowing across is extensible via the use of a \
type class, letting you pick the representation of requests and responses that \
best fits your use. Some pre-packaged, common instances are provided for you \
('ByteString', 'String'). \
 \
Here's an example use: \
 \
> > do > rsp <- Network.HTTP.simpleHTTP (getRequest 'http://www.haskell.org/') \
> -- fetch document and return it (as a 'String'.) > fmap (take 100) \
(getResponseBody rsp) > > do > (_, rsp) > <- Network.Browser.browse $ do > \
setAllowRedirects True -- handle HTTP redirects > request $ getRequest \
'http://www.haskell.org/' > return (take 100 (rspBody rsp)) \
 \
__Note:__ This package does not support HTTPS connections. If you need HTTPS, \
take a look at the following packages: \
 \
* <http://hackage.haskell.org/package/http-streams http-streams> \
 \
* <http://hackage.haskell.org/package/http-client http-client> (in combination \
with <http://hackage.haskell.org/package/http-client-tls http-client-tls>) \
 \
* <http://hackage.haskell.org/package/req req> \
 \
* <http://hackage.haskell.org/package/wreq wreq>."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-4000.4.1-5.11.aarch64.rpm"
RPM_HASH = "783f2941b99330e1dea22f3f9bad9532cb4ffc119f2696e622c1f341a06e6b6bebc579e961cbb646b3568d330f252b089ed6d5d9ccae74ba73c6f3dc90175e7c"

RPROVIDES:${PN} += "ghc-HTTP \
libHSHTTP-4000.4.1-G8VuDcYxUIH9Vk3NDIhhHx-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
