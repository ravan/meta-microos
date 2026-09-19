SUMMARY = "A client library for the D-Bus IPC system"
DESCRIPTION = "D-Bus is a simple, message-based protocol for inter-process communication, \
which allows applications to interact with other parts of the machine and the \
user's session using remote procedure calls. \
 \
D-Bus is a essential part of the modern Linux desktop, where it replaces \
earlier protocols such as CORBA and DCOP. \
 \
This library is an implementation of the D-Bus protocol in Haskell. It can be \
used to add D-Bus support to Haskell applications, without the awkward \
interfaces common to foreign bindings. \
 \
Example: connect to the session bus, and get a list of active names. \
 \
' &#x7b;-# LANGUAGE OverloadedStrings #-&#x7d; \
 \
import Data.List (sort) import DBus import DBus.Client \
 \
main = do &#x20; client <- connectSession &#x20; &#x20; -- Request a list of \
connected clients from the bus &#x20; reply <- call_ client (methodCall \
'/org/freedesktop/DBus' 'org.freedesktop.DBus' 'ListNames') &#x20; &#x7b; \
methodCallDestination = Just 'org.freedesktop.DBus' &#x20; &#x7d; &#x20; &#x20; \
-- org.freedesktop.DBus.ListNames() returns a single value, which is &#x20; -- \
a list of names (here represented as [String]) &#x20; let Just names = \
fromVariant (methodReturnBody reply !! 0) &#x20; &#x20; -- Print each name on a \
line, sorted so reserved names are below &#x20; -- temporary names. \
&#x20; mapM_ putStrLn (sort names) ' \
 \
>$ ghc --make list-names.hs >$ ./list-names >:1.0 >:1.1 >:1.10 >:1.106 >:1.109 \
>:1.110 >ca.desrt.dconf >org.freedesktop.DBus >org.freedesktop.Notifications \
>org.freedesktop.secrets >org.gnome.ScreenSaver."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "ghc-dbus-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "b8a1934d232466b9971b93c595e6a98a3fcc79ac22c026c2f3239d760e838afdf2b1a7ac11515faa1d37a6ca46215e8e08893071dbd0ccc2513e85f48852509c"

RPROVIDES:${PN} += "ghc-dbus \
libHSdbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSadjunctions-4.4.4-4nqsP3yaf6U1iY0vApuE6e-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSasync-2.2.6-4fW0sXrepSt4QxgAnnLVB6-ghc9.12.4.so \
libHSattoparsec-0.14.4-DCHy075kASN7LSOqkXsGoX-attoparsec-internal-ghc9.12.4.so \
libHSattoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSblaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o-ghc9.12.4.so \
libHSblaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScall-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3-ghc9.12.4.so \
libHScereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHSconduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt-ghc9.12.4.so \
libHSconduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSfree-5.2-4eWU5ydqIMF46nGJ3OnruR-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSindexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH-ghc9.12.4.so \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSinvariant-0.6.5-DrqO3CbAMrLCl36mqBRofr-ghc9.12.4.so \
libHSkan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I-ghc9.12.4.so \
libHSlens-5.3.6-J5P8ydEQLUbA8WXxD5pRjA-ghc9.12.4.so \
libHSmono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSprofunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSreflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF-ghc9.12.4.so \
libHSresourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstreaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHStyped-process-0.2.13.0-Igkw9DqKpM63tp2LRi4SDw-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSxml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4-ghc9.12.4.so \
libHSxml-types-0.3.8-35OA2z37X8M4UCRyGooeYw-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
