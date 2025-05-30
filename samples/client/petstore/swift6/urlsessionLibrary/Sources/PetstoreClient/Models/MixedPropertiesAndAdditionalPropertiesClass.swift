//
// MixedPropertiesAndAdditionalPropertiesClass.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

@available(*, deprecated, renamed: "PetstoreClientAPI.MixedPropertiesAndAdditionalPropertiesClass")
public typealias MixedPropertiesAndAdditionalPropertiesClass = PetstoreClientAPI.MixedPropertiesAndAdditionalPropertiesClass

extension PetstoreClientAPI {

public final class MixedPropertiesAndAdditionalPropertiesClass: @unchecked Sendable, Codable, ParameterConvertible, Hashable {

    public private(set) var uuid: UUID?
    public private(set) var dateTime: Date?
    public private(set) var map: [String: Animal]?

    public init(uuid: UUID? = nil, dateTime: Date? = nil, map: [String: Animal]? = nil) {
        self.uuid = uuid
        self.dateTime = dateTime
        self.map = map
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case uuid
        case dateTime
        case map
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(uuid, forKey: .uuid)
        try container.encodeIfPresent(dateTime, forKey: .dateTime)
        try container.encodeIfPresent(map, forKey: .map)
    }

    public static func == (lhs: MixedPropertiesAndAdditionalPropertiesClass, rhs: MixedPropertiesAndAdditionalPropertiesClass) -> Bool {
        lhs.uuid == rhs.uuid &&
        lhs.dateTime == rhs.dateTime &&
        lhs.map == rhs.map
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(uuid?.hashValue)
        hasher.combine(dateTime?.hashValue)
        hasher.combine(map?.hashValue)
        
    }
}

}
