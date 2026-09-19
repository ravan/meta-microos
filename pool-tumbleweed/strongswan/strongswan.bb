SUMMARY = "IPsec-based VPN solution"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
* IKEv1 and IKEv2 (RFC 4306, 9370) key exchange protocol support \
* Support of IPv6 IPsec tunnel and transport connections \
* Dynamic IP address and interface update with IKEv2 MOBIKE (RFC 4555) \
* Automatic insertion and deletion of IPsec-policy-based firewall rules \
* 128/192/256-bit AES encryption \
* NAT Traversal via UDP encapsulation and port floating (RFC 3947) \
* Dead Peer Detection (DPD, RFC 3706) to detect dangling tunnels \
* XAUTH server and client functionality on top of IKEv1 Main Mode authentication \
* Virtual IP address pool managed by IKE daemon or SQL database \
* IKEv2 EAP user authentication (EAP-SIM, EAP-AKA, EAP-MSCHAPv2, etc.) \
* Optional relaying of EAP messages to AAA server via EAP-RADIUS plugin \
* Support of IKEv2 Multiple Authentication Exchanges (RFC 4739) \
* Authentication based on X.509 certificates or preshared keys \
* Generation of a default self-signed certificate during first strongSwan startup \
* Retrieval and local caching of Certificate Revocation Lists via HTTP or LDAP \
* Full support of the Online Certificate Status Protocol (OCSP, RCF 2560). \
* CA management (OCSP and CRL URIs, default LDAP server) \
* IPsec policies based on wildcards or intermediate CAs \
* Group policies based on X.509 attribute certificates (RFC 3281) \
* Storage of RSA private keys and certificates on a smartcard (PKCS#11 interface) \
* Modular plugins for crypto algorithms and relational database interfaces \
* Support of elliptic curve DH groups and ECDSA certificates (Suite B, RFC 4869) \
* Linux desktop integration via the strongSwan NetworkManager applet \
 \
This package triggers the installation of both, IKEv1 and IKEv2 daemons."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-6.1.0-1.1.aarch64.rpm"
RPM_HASH = "a7ff39de9c0c3cf689b75e28c61e13c0baf167c6a5a2be9bf043bf07502d1fa358907eea3af19f2bb1883c92744d6cd9b758d4d23921699adc6d25080b2d217c"

RPROVIDES:${PN} += "config-strongswan \
libcharon.so.0 \
libimcv.so.0 \
libpttls.so.0 \
libradius.so.0 \
libsimaka.so.0 \
libstrongswan-addrblock.so \
libstrongswan-agent.so \
libstrongswan-attr-sql.so \
libstrongswan-attr.so \
libstrongswan-bypass-lan.so \
libstrongswan-ccm.so \
libstrongswan-certexpire.so \
libstrongswan-chapoly.so \
libstrongswan-cmac.so \
libstrongswan-constraints.so \
libstrongswan-counters.so \
libstrongswan-coupling.so \
libstrongswan-ctr.so \
libstrongswan-curl.so \
libstrongswan-dhcp.so \
libstrongswan-dnskey.so \
libstrongswan-drbg.so \
libstrongswan-eap-aka-3gpp2.so \
libstrongswan-eap-aka.so \
libstrongswan-eap-dynamic.so \
libstrongswan-eap-gtc.so \
libstrongswan-eap-identity.so \
libstrongswan-eap-md5.so \
libstrongswan-eap-mschapv2.so \
libstrongswan-eap-peap.so \
libstrongswan-eap-radius.so \
libstrongswan-eap-sim-file.so \
libstrongswan-eap-sim-pcsc.so \
libstrongswan-eap-sim.so \
libstrongswan-eap-simaka-pseudonym.so \
libstrongswan-eap-simaka-reauth.so \
libstrongswan-eap-simaka-sql.so \
libstrongswan-eap-tls.so \
libstrongswan-eap-tnc.so \
libstrongswan-eap-ttls.so \
libstrongswan-farp.so \
libstrongswan-fips-prf.so \
libstrongswan-gcm.so \
libstrongswan-gmp.so \
libstrongswan-ha.so \
libstrongswan-kdf.so \
libstrongswan-kernel-netlink.so \
libstrongswan-ldap.so \
libstrongswan-md4.so \
libstrongswan-mgf1.so \
libstrongswan-nonce.so \
libstrongswan-openssl.so \
libstrongswan-pem.so \
libstrongswan-pgp.so \
libstrongswan-pkcs1.so \
libstrongswan-pkcs11.so \
libstrongswan-pkcs7.so \
libstrongswan-pkcs8.so \
libstrongswan-pubkey.so \
libstrongswan-radattr.so \
libstrongswan-random.so \
libstrongswan-resolve.so \
libstrongswan-revocation.so \
libstrongswan-socket-default.so \
libstrongswan-sql.so \
libstrongswan-sshkey.so \
libstrongswan-tnc-imc.so \
libstrongswan-tnc-imv.so \
libstrongswan-tnc-pdp.so \
libstrongswan-tnc-tnccs.so \
libstrongswan-tnccs-20.so \
libstrongswan-unity.so \
libstrongswan-updown.so \
libstrongswan-vici.so \
libstrongswan-x509.so \
libstrongswan-xauth-eap.so \
libstrongswan-xauth-pam.so \
libstrongswan-xcbc.so \
libstrongswan.so.0 \
libtls.so.0 \
libtnccs.so.0 \
libtpmtss.so.0 \
libvici.so.0 \
strongswan \
strongswan-libs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgmp.so.10 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libpam.so.0 \
libpcsclite.so.1 \
libsystemd.so.0 \
systemd"

inherit rpm
